/*
 * Created on May 20, 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package ca.mcgill.sable.soot.callgraph;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.jface.action.*;
import org.eclipse.gef.ui.actions.*;
import org.eclipse.ui.*;
import ca.mcgill.sable.graph.*;


/**
 * @author jlhotak
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CGMenuProvider extends ContextMenuProvider {

	ActionRegistry registry;
	EditPartViewer viewer;
	IWorkbenchPart part;
	
	/**
	 * @param viewer
	 */
	public CGMenuProvider(EditPartViewer viewer, ActionRegistry registry, IWorkbenchPart part) {
		super(viewer);
		setRegistry(registry);
		this.part = part;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ContextMenuProvider#buildContextMenu(org.eclipse.jface.action.IMenuManager)
	 */
	public void buildContextMenu(IMenuManager menu) {
		GEFActionConstants.addStandardActionGroups(menu);
		
		// TODO Auto-generated method stub
		//IAction showCode = new ShowCodeAction(part);
		menu.add(getRegistry().getAction(ExpandAction.EXPAND));
		menu.add(getRegistry().getAction(CollapseAction.COLLAPSE));
		
		menu.add(getRegistry().getAction(ShowCodeAction.SHOW_IN_CODE));
		//getRegistry().registerAction(showCode);
		//((GraphEditor)part).getGraphEditorSelectionActions().add(showCode);
	}

	/**
	 * @return
	 */
	public ActionRegistry getRegistry() {
		return registry;
	}

	/**
	 * @param registry
	 */
	public void setRegistry(ActionRegistry registry) {
		this.registry = registry;
	}

}