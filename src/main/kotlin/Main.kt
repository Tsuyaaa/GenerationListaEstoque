fun main() {
    val listaProd = mutableListOf<String?>()
    var escolha: Int
    var optFinal: Int

    while (true) {
        print("Adicione produtos ao estoque: ")
        var prod = readLine()!!

        if (prod.isEmpty()) {
            break
        } else {
            listaProd.add(prod)
        }

    }

    while (true) {
        do {
            println("\nGostaria de retirar algo do estoque?")
            print("Digite 1 para sim, 2 para não: ")
            escolha = readLine()!!.toInt()

            if (escolha != 1 && escolha != 2) {
                print("\nOpção inválida")
            }
        } while (escolha != 1 && escolha != 2)
        when (escolha) {
            1 -> {
                print("\nInsira o produto que gostaria de retirar: ")
                var prod = readLine()!!
                if (listaProd.contains(prod)) {
                    listaProd.remove(prod)
                    println("\n$prod retirado.")
                } else {
                    println("\nNão há $prod na lista.")

                }

            }

            2 -> {
                println("\nNehum produto retirado.")
                break
            }

        }
    }
        while (true) {
            do {
                println("\nGostaria de realizar uma última alteração?")
                print("Digite 1 para sim, 2 para não: ")
                optFinal = readLine()!!.toInt()

                if (escolha != 1 && escolha != 2) {
                    print("\nOpção inválida")
                }
            } while (escolha != 1 && escolha != 2)
            when (optFinal) {
                1 -> {
                    println("\nSelecione um item da lista de 0 a ${listaProd.size - 1} para alterar.")
                    print("Digite o número do produto: ")
                    val position = readLine()!!.toInt()

                    if (position in 0..(listaProd.size - 1)) {
                        print("Agora digite o produto que será atualizado: ")
                        val prod = readLine()!!
                        listaProd[position] = prod

                    } else {
                        println("\nEste item não existe")

                    }


                }

                2 -> {
                    println("\nNenhum produto alterado.")
                    break
                }


            }


        }
        println("\nOs produtos do estoque são: ")
        listaProd.forEach() {
            println(it)
        }


    }





