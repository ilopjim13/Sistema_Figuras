class Circulo(color:String, val radio: Double) :Figura(color) {
    override fun area() :Double {
        return Math.PI * (this.radio*this.radio)
    }

    override fun perimetro() :Double {
        return 2 * Math.PI * this.radio
    }
}