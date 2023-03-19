
public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
	double tope;

@Override
public float valorFinal(float tope) {
	if((valorInicial * this.getValorDesc()<tope){
		return valorInicial - (tope)}else
	
	
	return valorInicial - (valorInicial * this.getValorDesc());
}
}
