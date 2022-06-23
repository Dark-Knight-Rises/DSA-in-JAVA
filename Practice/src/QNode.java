public class QNode {
    QNode next;
    TreeNode data;

    QNode(TreeNode data) {
        this.data = data;
        next = null;
    }
}
