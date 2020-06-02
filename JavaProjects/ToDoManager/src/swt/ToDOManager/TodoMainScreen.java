package swt.ToDOManager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;


import com.swtcomponents.*;


public class TodoMainScreen implements UIBuilder {

	ControlBuilder builder;
	int count;


	@Override
	public void build(Composite parent) {
		
		builder=new ControlBuilder(parent);
		parent.setSize(600,400);
		buildMenu(parent);
		
	}


	private void buildMenu(Composite parent) {
		// TODO Auto-generated method stub
		Shell shell=(Shell) parent;
		
		//STEP 1. menuBar can be connected only to a Shell
		//  It creates the large bar
		Menu menuBar=new Menu(shell,SWT.BAR);
		
		
		//STEP 2. create MenuItem to display on the MenuBar. 
		//This item MUST be MenuItem with CASCADE Design
		MenuItem menuBarFile= new MenuItem(menuBar, SWT.CASCADE);
		menuBarFile.setText("&File");
		
		MenuItem menuBarHelp= new MenuItem(menuBar, SWT.CASCADE);
		menuBarHelp.setText("&Help");
		
		//STEP 3. Menu need to have dropdown list of Menus		
		Menu menuFile=new Menu(shell, SWT.DROP_DOWN);
		MenuItem menuFileNew=new MenuItem(menuFile,SWT.PUSH);
		menuFileNew.setText("&New");
		
		/*
		 * //Sub Menu Menu menuFileNewSubMemu = new Menu(menuFile, SWT.DROP_DOWN);
		 * MenuItem menuFileSubFile=new MenuItem(menuFileNewSubMemu,SWT.PUSH);
		 * menuFileSubFile.setText("&New");
		 */
		
		MenuItem menuFileOpen=new MenuItem(menuFile,SWT.PUSH);
		menuFileOpen.setText("&Open");
		new MenuItem(menuFile, SWT.SEPARATOR); //no need to refer this component
		MenuItem menuFileSave=new MenuItem(menuFile,SWT.PUSH);
		menuFileSave.setText("&Save");
		MenuItem menuFileSaveAs=new MenuItem(menuFile,SWT.PUSH);
		menuFileSaveAs.setText("Save &As");
		
		new MenuItem(menuFile, SWT.SEPARATOR); //no need to refer this component
		
		MenuItem menuFileExit=new MenuItem(menuFile,SWT.PUSH);
		menuFileExit.setText("E&xit");
		menuFileExit.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				Application.instance.getShell().dispose();
			}
		});
		
		//for help memu
		Menu menuHelp=new Menu(shell, SWT.DROP_DOWN);
		MenuItem menuHelpAbout=new MenuItem(menuHelp,SWT.PUSH);
		menuHelpAbout.setText("&About");
		menuHelpAbout.addListener(SWT.Selection, new Listener() {
			
			public void handleEvent(Event arg0) {
				count++;
				AboutScreen about=new AboutScreen("About #"+count);
			}
		});
		
		//STEP 4. Associate this  Dropdown fileMenu with cascade file menu on the bar 
		menuBarFile.setMenu(menuFile);
		menuBarHelp.setMenu(menuHelp);
		//Final Step — Associate the menuBar as the menuBar of the shell
		shell.setMenuBar(menuBar);
		

		
		
		
	}

}
