package main

import (
	"fmt"
	"strings"
	"strconv"
)

func main() {
	var entrada string
	var lista_inteiros []int

	fmt.Scan(&entrada)
	lista := strings.Split(entrada, " ")

	for _, valor := range lista {
		numero, _ := strconv.Atoi(valor)
		lista_inteiros = append(lista_inteiros, numero)
		fmt.Print(valor)
	}

	fmt.Printf("%T\n", lista_inteiros)
	fmt.Println(lista_inteiros)
}
