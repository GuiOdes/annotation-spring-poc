package com.guiodes.customannotationspoc.annotation

@Target(AnnotationTarget.FUNCTION) // Define que a anotação pode ser utilizada em funções
@Retention(AnnotationRetention.RUNTIME) // Define que a anotação estará disponível em tempo de execução
annotation class LogResult
