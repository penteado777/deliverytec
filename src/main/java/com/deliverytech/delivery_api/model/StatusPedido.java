package com.deliverytech.delivery_api.model;

public enum StatusPedido {

        // O momento em que o pedido foi criado pelo cliente, mas ainda não foi confirmado  pelo restaurante 
    CRIADO("Criado"), 
        // aguardando a confirmação do restaurante
    PENDENTE("Pendente"),   
        // o restaurante confirmou que recebeu o pedido
    CONFIRMADO("Confirmado"), 
        // esta na preparação do pedido
    PREPARANDO("Preparando"), 
        // moto_entregador
    SAIU_PARA_ENTREGA("Saiu para entrega"), 
        //o pedido foi entregue pelo motoboy
    ENTREGUE("Entregue"), 
        // o usuário realiza o cancelamento
    CANCELADO("Cancelado");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }  

}
