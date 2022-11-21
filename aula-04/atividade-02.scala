var peso := leia_inteiro
var altura := leia_numero

var imc := peso / (altura * altura)

se imc < 17 então
imprima "Muito abaixo do peso"
    senão
    se imc >= 17 |e| imc <= 18 então
    imprima "Abaixo do peso"
        senão
        se imc >= 18 |e| imc <= 24 então
            imprima "Peso normal"
            senão
            se imc >= 25 |e| imc <= 29 então
            imprima "Acima do peso"
                senão
                se imc >= 30 |e| imc <= 34 então
                imprima "Obesidade I"
                    senão
                    se imc >= 35 |e| imc <= 39 então
                    imprima "Obesidade II (severa)"
                        senão
                        se imc > 40 então
                            imprima "Obesidade III (mórbida)"
                        fim
                    fim
                fim
            fim
        fim
    fim
fim