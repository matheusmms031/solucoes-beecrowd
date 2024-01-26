package main
 
import "fmt"
 
func main() {

	for contador := 1; contador > 100; contador++ {
		if contador % 2 == 0 {
			fmt.Println(contador)
		}
	}
}
