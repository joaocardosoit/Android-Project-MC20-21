package pt.ulusofona.deisi.a2020.cm.g2.ui.listeners

import pt.ulusofona.deisi.a2020.cm.g2.data.local.entities.DadosCovid

interface DadosCovidListener {
    fun dadosCovid(dadosCovid: DadosCovid?)
}