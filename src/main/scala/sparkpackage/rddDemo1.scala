package sparkpackage

import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}
import sparkpackage.TransformationsDemo1.getRows

object rddDemo1 {
def main(args:Array[String]): Unit ={
  //    Set log information to error
  Logger.getLogger("org").setLevel(Level.ERROR)
  //    Create SparkConf object
  val conf = new SparkConf().setMaster("local[*]").setAppName("RDD Demo")
  //    Create SparkContext object
  val sc = new SparkContext(conf)
  //    Input and Output path
  val inputPath = "E:/Hadoop/IT-HELP-DESK.csv" //args(0)
  val outputPath = "E:/Hadoop/helpdesk-output1" //args(1)
  //    Read input file
  val helpdeskFile = sc.textFile(inputPath)
  //    Remove header
  val helpDeskHeader = helpdeskFile.first()
  val helpdeskData = helpdeskFile.filter(row => row != helpDeskHeader)
  //    Assign schema to rows
  val helpdeskRdd = helpdeskData.map(getRows)
  val seniorityDaysOpenPairRdd = helpdeskRdd.map(x=>(x.requestorSeniority,x.daysOpen))
  val daysOpenSumCountRdd = seniorityDaysOpenPairRdd.combineByKey((c)=>(c,1),
                                          (mv:(Int,Int),v)=>(mv._1+v,mv._2+1),
                                          (mc1:(Int,Int),mc2:(Int,Int))=>(mc1._1+mc2._1,mc1._2+mc2._2))
  val daysOpenAvgRdd = daysOpenSumCountRdd.map{case(key,value)=>(key,value._1/value._2.toFloat)}
  daysOpenAvgRdd.sortByKey(true).collect().foreach(println(_))

}
}
