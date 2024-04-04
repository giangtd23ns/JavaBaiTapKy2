package fileTree;

import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.*;

public class View extends JFrame{
	private JTree tree;
    private JTextArea textArea;
    private JSplitPane splitPane;

    public View(DefaultMutableTreeNode rootNode) {
        super("File Tree");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tree = new JTree(rootNode);
        tree.setEditable(false);

        textArea = new JTextArea();
        JScrollPane textScrollPane = new JScrollPane(textArea);

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(tree), textScrollPane);

        this.getContentPane().add(splitPane);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
