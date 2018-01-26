package grails332.stylesheet.issue

import java.util.concurrent.ThreadLocalRandom

import foo.Ping
import foo.Pong

class BootStrap {

  String nextName(String root) {
    int rnd = ThreadLocalRandom.current().nextInt(0, 10000)
    String.format("${root}%04d", rnd)
  }

    def init = { servletContext ->
      def ping = new Ping(name: nextName('Ping')).save()
      def pong1 = new Pong(name: nextName('Pong'), ping: ping).save()
      def pong2 = new Pong(name: nextName('Pong'), ping: ping).save()
      def pong3 = new Pong(name: nextName('Pong'), ping: ping).save()
      def pong4 = new Pong(name: nextName('Pong'), ping: ping).save()
      ping.save(flush: true)
    }

    def destroy = {
    }
}
