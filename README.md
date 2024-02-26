## Simulador de Memória com Escalonamento

O escalonamento FIFO (First-In-First-Out) ou FCFS (First-Come, First Served) é o método mais básico de escalonamento de processos, onde as tarefas são atendidas na ordem em que chegam à fila de tarefas prontas. Este projeto combina a fila de processos prontos e a fila de processos bloqueados em uma única fila de processos bloqueados. O algoritmo apresentado representa o modo cooperativo de escalonamento FCFS, no qual o processador executa uma tarefa por vez.

Para melhorar o desempenho, os processos são alocados na memória de acordo com sua posição na fila de bloqueados. O processo em execução e os primeiros processos da fila de bloqueados são armazenados na memória principal. Se a memória principal estiver cheia, os últimos processos da fila de bloqueados são armazenados na memória secundária. Para executar essa realocação de memória (swap), é necessário que haja na memória secundária um espaço igual ou maior que o tamanho do maior processo.




