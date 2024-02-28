## Simulador de Memoria e Escalonador

O escalonamento FCFS (First-Come, First Served) é um método fundamental de escalonamento de processos, onde as tarefas são tratadas na ordem em que chegam à fila de processos prontos. Neste projeto, a fila de processos prontos e a fila de processos bloqueados são combinadas em uma única fila de processos bloqueados. O algoritmo apresentado segue o modelo cooperativo de escalonamento FCFS, onde o processador executa uma tarefa por vez.

Para otimizar o desempenho, os processos são alocados na memória de acordo com sua posição na fila de bloqueados. O processo em execução e os primeiros processos da fila de bloqueados são armazenados na memória principal. Se a memória principal estiver cheia, os últimos processos da fila de bloqueados são armazenados na memória secundária. Para realizar essa realocação de memória (swap), é necessário que haja espaço suficiente na memória secundária, igual ou maior que o tamanho do maior processo.




