package eu.agilejava.snoopee;

import org.netbeans.api.core.ide.ServicesTabNodeRegistration;
import org.openide.nodes.AbstractNode;
import static org.openide.nodes.Children.LEAF;

/**
 *
 * @author Ivar Grimstad (ivar.grimstad@gmail.com)
 */
@ServicesTabNodeRegistration(
        name = "SnoopEE Service Plugin", 
        displayName = "SnoopEE Service", 
        iconResource = "eu/agilejava/snoopee/snoopee-icon.png")
public class SnoopEERootNode extends AbstractNode {

    public SnoopEERootNode() {
        super(LEAF);
    }

}
