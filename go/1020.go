package main
 
import (
    "fmt"
)
 
func main() {
    var n1 int
    fmt.Scan(&n1)
	years := n1 / 365
    weaks := (n1 - (years*365))/30
    days := n1 - ((years*365) + weaks*30)
    fmt.Printf("%v ano(s)\n%v mes(es)\n%v dia(s)\n",years,weaks,days)
}
