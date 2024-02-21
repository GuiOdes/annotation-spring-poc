package com.guiodes.customannotationspoc.annotation

import com.guiodes.customannotationspoc.logger
import mu.KotlinLogging
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class LogResultAspect {

    @Around("@annotation(LogResult)") // Define a anotação que será interceptada. Neste caso, a anotação @LogResult
    fun logResult(joinPoint: ProceedingJoinPoint) {
        val result = joinPoint.proceed()
        logger.info {
            "Result: $result " +
                    "from method: ${joinPoint.signature.name}" +
                    " with arguments: ${joinPoint.args.joinToString()}" +
                    " from time: ${System.currentTimeMillis()}"
        }
    }
}
