package fileTree;

import java.io.File;
import java.util.Arrays;
import javax.swing.tree.DefaultMutableTreeNode;

public class Model {
	private DefaultMutableTreeNode rootNode;
	private File rootDir;

    public Model() {
        rootNode = new DefaultMutableTreeNode("D:\\");
        rootDir = new File("D:\\");
        createNodes(rootDir, rootNode);
    }

    public void createNodes(File file, DefaultMutableTreeNode parentNode) {
        // Kiểm tra xem file có phải là thư mục không, nếu không phải thì kết thúc
        if (!file.isDirectory()) return;

        // Lấy danh sách các tệp và thư mục con
        File[] files = file.listFiles();
        if (files == null) return;

        // Sử dụng Stream và forEach để duyệt qua từng tệp và thư mục con
        Arrays.stream(files)
              .forEach(f -> {
                  DefaultMutableTreeNode node = new DefaultMutableTreeNode(f.getName());
                  parentNode.add(node);
                  // Nếu là thư mục, tiếp tục tạo các nút con
                  if (f.isDirectory()) {
                      createNodes(f, node);
                  }
              });
    }

    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }
}
