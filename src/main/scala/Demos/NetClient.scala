package Demos

import java.io.OutputStream
import java.net.{ServerSocket, Socket}

object NetClient extends App {

  val server = new Socket("localhost", 9999)
  println("Server connected,send data")
  val out: OutputStream = server.getOutputStream
  out.write(100)
  out.close()
  println("send data to server: 100")
  server.close()

}
