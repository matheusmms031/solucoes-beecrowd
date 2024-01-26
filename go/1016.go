package main
 
import "fmt"
 
func main() {

	var valor float32
	fmt.Scan(&valor)
	var horas int = int(valor) / 3600
	var minutos int = (int(valor) - horas*3600) / 60
	var segundos int = (int(valor) - (horas*3600 + minutos*60))

	fmt.Printf("%v:%v:%v\n",horas,minutos,segundos)
}
