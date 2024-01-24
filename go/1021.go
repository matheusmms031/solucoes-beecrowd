package main

import "fmt"

func main() {
	var valor float64
	fmt.Scan(&valor)

	notas := []float64{100, 50, 20, 10, 5, 2}
	moedas := []float64{1, 0.50, 0.25, 0.10, 0.05, 0.01}

	fmt.Println("NOTAS:")
	for _, nota := range notas {
		qtdNotas := int(valor / nota)
		fmt.Printf("%d nota(s) de R$ %.2f\n", qtdNotas, nota)
		valor -= float64(qtdNotas) * nota
	}

	fmt.Println("MOEDAS:")
	for _, moeda := range moedas {
		qtdMoedas := int(valor / moeda)
		fmt.Printf("%d moeda(s) de R$ %.2f\n", qtdMoedas, moeda)
		valor -= float64(qtdMoedas) * moeda
	}
}
