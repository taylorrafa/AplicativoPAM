CidadeAdapter.kt
package com.example.estadoscidades
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class CidadeAdapter(private val cidades: List<Cidade>) :
    RecyclerView.Adapter<CidadeAdapter.CidadeViewHolder>() {
    // ViewHolder: guarda as referências dos componentes de UM item da lista
    class CidadeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtNome: TextView = itemView.findViewById(R.id.txtNomeCidade)
        val txtCodigo: TextView = itemView.findViewById(R.id.txtCodigoCidade)
    }
    // 1) Cria um "cartão" novo a partir do item_cidade.xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CidadeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cidade, parent, false)
        return CidadeViewHolder(view)
    }
    // 2) Preenche um cartão com os dados da cidade daquela posição
    override fun onBindViewHolder(holder: CidadeViewHolder, position: Int) {
        val cidade = cidades[position]
        holder.txtNome.text = cidade.nome
        holder.txtCodigo.text = "Código IBGE: ${cidade.id}"
    }
    // 3) Informa quantos itens a lista tem
    override fun getItemCount(): Int = cidades.size
}