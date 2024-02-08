class Triangulo(color:String, var base:Double, var altura :Double, var lado1 :Double, var lado2 :Double) :Figura(color) {
    override fun area() :Double {
        return this.base * this.altura /2
    }

    override fun perimetro() :Double {
        return this.base + this.lado2 + this.lado1
    }
}