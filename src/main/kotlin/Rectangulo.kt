class Rectangulo(color:String, var base:Double, var altura :Double) :Figura(color) {
    override fun area() :Double {
        return this.base * this.altura
    }

    override fun perimetro() :Double {
        return (this.base*this.base) + (this.altura*this.altura)
    }

}