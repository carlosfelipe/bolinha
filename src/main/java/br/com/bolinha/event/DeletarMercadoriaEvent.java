package br.com.bolinha.event;

import br.com.bolinha.model.Mercadoria;

/**
 * Evento deve ser gerado durante a exclusão de uma <code>Mercadoria</code>.
 * 
 * <p>Recebe a referência da <code>Mercadoria</code> que foi removida.</p>
 * 
 * @author YaW Tecnologia
 */
public class DeletarMercadoriaEvent extends AbstractEvent<Mercadoria> {
    
    public DeletarMercadoriaEvent(Mercadoria m) {
        super(m);
    }
    
}
