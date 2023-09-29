package com.example.family.data

import com.example.family.R
import com.example.family.model.Member

class Datasource {// fjgkf
    fun loadMember(): List<Member>{
        return listOf<Member>(
            Member(R.string.father, R.drawable.father),
            Member(R.string.mother, R.drawable.mother),
            Member(R.string.brother1, R.drawable.anton),
            Member(R.string.brother2, R.drawable.evgeniy),
            Member(R.string.sister1, R.drawable.margo),
            Member(R.string.brother3, R.drawable.semen),
            Member(R.string.brother4, R.drawable.mirik),
            Member(R.string.sister2, R.drawable.lilly),
            Member(R.string.brother5, R.drawable.nik),
            Member(R.string.brother6, R.drawable.vitalik),
            Member(R.string.brother7, R.drawable.rostik),
            Member(R.string.sister3, R.drawable.yana),
            Member(R.string.brother8, R.drawable.andrei),
            Member(R.string.brother9, R.drawable.gena),
            Member(R.string.brother10, R.drawable.sergio),
            Member(R.string.brother11, R.drawable.alexei),
        )

    }
}