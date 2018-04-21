package br.usjt.desenvmob.aula03.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Tatiane do Nascimento Ayres 816118367.
 */

public class Data {

    public static ArrayList<Chamado> criarChamados(){
        ArrayList<Chamado> lista = new ArrayList<>();
        Chamado chamado = new Chamado();
        chamado.setNumero(1);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Computador da secretára quebrado");
        Fila fila = new Fila();
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado2 = new Chamado();
        chamado.setNumero(2);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Telefone não funciona.");
        Fila fila2 = new Fila();
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado3 = new Chamado();
        chamado.setNumero(3);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Manutenção no proxy");
        Fila fila3 = new Fila();
        fila.setId(FilaId.REDES.id());
        fila.setNome(FilaId.REDES.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado4 = new Chamado();
        chamado.setNumero(4);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("Lentidão generalizada.");
        Fila fila4 = new Fila();
        fila.setId(FilaId.SERVIDORES.id());
        fila.setNome(FilaId.SERVIDORES.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado5 = new Chamado();
        chamado.setNumero(5);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("CRM");
        Fila fila5 = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado6 = new Chamado();
        chamado.setNumero(6);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("atualizar versão.");
        Fila fila6 = new Fila();
        fila.setId(FilaId.ERP.id());
        fila.setNome(FilaId.ERP.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado7 = new Chamado();
        chamado.setNumero(7);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("Rede MPLS");
        Fila fila7 = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado8 = new Chamado();
        chamado.setNumero(8);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("incluir pipeline.");
        Fila fila8 = new Fila();
        fila.setId(FilaId.VENDAS.id());
        fila.setNome(FilaId.VENDAS.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado9 = new Chamado();
        chamado.setNumero(9);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("erro contábil");
        Fila fila9 = new Fila();
        fila.setId(FilaId.ERP.id());
        fila.setNome(FilaId.ERP.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado10 = new Chamado();
        chamado.setNumero(10);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("Gestão de Orçamento");
        Fila fila10 = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado11 = new Chamado();
        chamado.setNumero(11);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("Big Data");
        Fila fila11 = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado12 = new Chamado();
        chamado.setNumero(12);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("Internet com lentidão");
        Fila fila12 = new Fila();
        fila.setId(FilaId.REDES.id());
        fila.setNome(FilaId.REDES.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado13 = new Chamado();
        chamado.setNumero(13);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("Chatbot");
        Fila fila13 = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado14 = new Chamado();
        chamado.setNumero(14);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("troca de senha");
        Fila fila14 = new Fila();
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado15 = new Chamado();
        chamado.setNumero(15);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("falha no Windows");
        Fila fila15 = new Fila();
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado16 = new Chamado();
        chamado.setNumero(16);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("ITIL V3");
        Fila fila16 = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado17 = new Chamado();
        chamado.setNumero(17);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("liberar celular");
        Fila fila17 = new Fila();
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado18 = new Chamado();
        chamado.setNumero(18);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("mover ramal");
        Fila fila18 = new Fila();
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado19 = new Chamado();
        chamado.setNumero(19);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("ponto com defeito");
        Fila fila19 = new Fila();
        fila.setId(FilaId.REDES.id());
        fila.setNome(FilaId.REDES.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamad20 = new Chamado();
        chamado.setNumero(20);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("ferramenta EMM");
        Fila fila20 = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        return lista;
    }

    public static ArrayList<Chamado> buscarChamados(String chave){
        ArrayList<Chamado> lista = criarChamados();
        if(chave == null || chave.length() == 0){
            return lista;
        }
        ArrayList<Chamado> resultado = new ArrayList<>();
        for(Chamado chamado : lista){
            if(chamado.getFila().getNome().toUpperCase().contains(chave.toUpperCase())){
                resultado.add(chamado);
            }
        }
        return resultado;
    }
}
