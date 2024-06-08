package com.medtech.processos;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;

import java.util.ArrayList;
import java.util.List;

public class ProcessosPC {
    Looca looca = new Looca();

    ProcessoGrupo processoGrupo = looca.getGrupoDeProcessos();
    List<Processo> processos = processoGrupo.getProcessos();
    Integer totalProcessos = processoGrupo.getTotalProcessos();

    public Integer exibeTotalProcessos() {
        return totalProcessos;
    }

    public List<String> exibeProcessos() {
        List<String> detalhesProcessos = new ArrayList<>();
        for (Processo processo : processos) {
            detalhesProcessos.add(processo.toString());
        }
        return detalhesProcessos;
    }
}
