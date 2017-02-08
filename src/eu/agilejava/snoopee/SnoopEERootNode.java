package eu.agilejava.snoopee;

import javax.swing.Action;
import org.netbeans.api.core.ide.ServicesTabNodeRegistration;
import org.openide.actions.NewAction;
import org.openide.nodes.AbstractNode;
import static org.openide.nodes.Children.LEAF;
import org.openide.util.actions.SystemAction;

/**
 *
 * @author Ivar Grimstad (ivar.grimstad@gmail.com)
 */
@ServicesTabNodeRegistration(
        name = "SnoopEE Service Plugin", 
        displayName = "SnoopEE Service", 
        iconResource = "eu/agilejava/snoopee/snoopee-icon.png")
public class SnoopEERootNode extends AbstractNode {

    private String snoopeeServiceRoot;
    
    public SnoopEERootNode() {
        super(LEAF);
    }

    @Override
    public Action getPreferredAction() {
        return SystemAction.get(NewAction.class);
    }

    
    
}
