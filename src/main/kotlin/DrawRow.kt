class DrawRow {
    val nodes = mutableListOf<Node>().apply {
        repeat(SnakeGame.map_size) {
            add(Node(false))
        }
    }



}