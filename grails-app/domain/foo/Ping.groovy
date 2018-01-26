package foo

class Ping {
  String name

  static hasMany = [pongs: Pong]
  static constraints = {
    name blank: false, maxLength: 40
  }

  String toString() {
    name
  }
}
