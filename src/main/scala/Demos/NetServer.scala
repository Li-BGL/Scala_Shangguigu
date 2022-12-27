package Demos

import java.io.InputStream
import java.net.{ServerSocket, Socket}

object NetServer extends App {

  //create server
  // 网络通讯中，没有办法传输对象，数字这样的内容，传送的是ascii字节码
  //字符串可以变成字节码
  //可以将对象转换为字节码，这个过程叫做序列化
  //将字节码转换为对象，这个过程叫反序列化

  val server = new ServerSocket(9999)
  println("service starts, waiting to be connected.")
  val client:Socket = server.accept()
  val in: InputStream = client.getInputStream
  val result: Int = in.read()
  println("get the data from client: " + result)
  in.close()
  client.close()
  server.close()



}
