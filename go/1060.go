package main
 
import "fmt"
 
func main() {

	var valor float32
	var positivos int16
	for i := 0; i < 6; i++ {
        fmt.Scan(&valor)
		if valor > 0 {
			positivos += 1
		}
    }
	fmt.Printf("%v valores positivos\n",positivos)
}
