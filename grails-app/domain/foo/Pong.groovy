package foo

class Pong {
  String name

  static belongsTo = [ping: Ping]
  static constraints = {
    name blank: false, maxLength: 40
  }

  String toString() {
    name
  }
}
