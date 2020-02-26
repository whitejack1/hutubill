package Startup;

import javax.swing.SwingUtilities;

import Gui.Frame.MainFrame;
import Gui.Panel.MainPanel;
import Gui.Panel.SpendPanel;
import Gui.Util.GUIUtil;
 
public class Bootstrap {
    public static void main(String[] args) throws Exception{
        GUIUtil.useLNF();
 
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                MainFrame.instance.setVisible(true);
                MainPanel.instance.workingPanel.show(SpendPanel.instance);
            }
        });
    }
}
