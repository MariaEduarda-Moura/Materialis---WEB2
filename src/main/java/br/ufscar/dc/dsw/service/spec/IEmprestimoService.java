package br.ufscar.dc.dsw.service.spec;

import java.util.List;
import java.util.Map;
import br.ufscar.dc.dsw.domain.Emprestimo;
import br.ufscar.dc.dsw.domain.Estudante;
import br.ufscar.dc.dsw.domain.Material;

public interface IEmprestimoService {
    Emprestimo buscarPorId(Long id);

    List<Emprestimo> buscarTodos();

    void salvar(Emprestimo emprestimo);

    void excluir(Long id);

    List<Emprestimo> buscarPorEstudante(Estudante estudante);

    List<Emprestimo> buscarSolicitacoesParaEstudanteDoador(Estudante estudanteDoador);

    boolean hasOpenProposal(Estudante estudante, Material material);

    void aprovarEmprestimo(Long id);

    void recusarEmprestimo(Long id, String justificativa);

    void iniciarEmprestimo(Long id);

    void concluirEmprestimo(Long id);

    List<Emprestimo> buscarPorMaterial(Material material);

    /**
     * Retorna, para cada material informado, o empréstimo vigente (em andamento ou
     * aprovado aguardando retirada). Materiais sem empréstimo vigente não aparecem no mapa.
     */
    Map<Long, Emprestimo> buscarVigentesPorMateriais(List<Material> materiais);

    /** Empréstimo vigente de um material, ou null se ele está disponível. */
    Emprestimo buscarVigente(Material material);
}