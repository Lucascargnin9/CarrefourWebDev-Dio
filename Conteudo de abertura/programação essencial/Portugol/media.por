programa
{
	
	funcao inicio()
	{

	real nota1,nota2,nota3,media
	cadeia nome

	escreva("Nome:")
	leia(nome)

	escreva("nota1?")
	leia(nota1)
	escreva("nota2?")
	leia(nota2)
	escreva("nota3?")
	leia(nota3)

	media=(nota1+nota2+nota3)/3

	se (media>=6)	{
	escreva("media:"+media+"status: Aprovado")
	} senao escreva("media:"+media+ "status: Reprovado")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */