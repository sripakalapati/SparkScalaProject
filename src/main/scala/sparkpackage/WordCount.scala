package sparkpackage

import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}

object WordCount {
def main(args:Array[String]): Unit ={
//  Logger.getLogger("org").setLevel(Level.ERROR)
  val conf = new SparkConf().setAppName("Word Count").setMaster("local[*]")
  val sc = new SparkContext(conf)
//  val inputPath = "E:/Hadoop/empdata.txt"
//  val outputPath = "E:/Hadoop/wc_output"
  val inputPath = args(0)
  val outputPath = args(1)
  sc.textFile(inputPath).flatMap(_.split("|")).map((_,1)).reduceByKey(_+_).map(rec=>rec._1 + "\t" + rec._2).saveAsTextFile(outputPath)
}
}
