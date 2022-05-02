/*
Скомпилируйте классы Person и SecretAgent из раздела 8.6 «Пе-
реопределение полей» и проанализируйте результаты компи-
ляции с помощью javap. Сколько полей name вы обнаружили?
Сколько методов чтения name вы обнаружили? Что они дела-
ют? (Подсказка: используйте ключи -c и -private.)
 */
package chapter_08

object task_08 extends App {
    class Person(val name: String) {
        override def toString = s"${getClass.getName}[name=$name]"
    }
    class SecretAgent(codename: String) extends Person(codename) {
        override val name = "secret" // Скрыть имя ...
        override val toString = "secret" // ... и имя класса
    }
}


/*

$ javap -c -private chapter_08/task_08

Compiled from "task_08.scala"
public final class chapter_08.task_08 {
  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #16                 // Field chapter_08/task_08$.MODULE$:Lchapter_08/task_08$;
       3: aload_0
       4: invokevirtual #18                 // Method chapter_08/task_08$.main:([Ljava/lang/String;)V
       7: return

  public static void delayedInit(scala.Function0<scala.runtime.BoxedUnit>);
    Code:
       0: getstatic     #16                 // Field chapter_08/task_08$.MODULE$:Lchapter_08/task_08$;
       3: aload_0
       4: invokevirtual #22                 // Method chapter_08/task_08$.delayedInit:(Lscala/Function0;)V
       7: return

  public static java.lang.String[] args();
    Code:
       0: getstatic     #16                 // Field chapter_08/task_08$.MODULE$:Lchapter_08/task_08$;
       3: invokevirtual #26                 // Method chapter_08/task_08$.args:()[Ljava/lang/String;
       6: areturn

  public static void scala$App$_setter_$executionStart_$eq(long);
    Code:
       0: getstatic     #16                 // Field chapter_08/task_08$.MODULE$:Lchapter_08/task_08$;
       3: lload_0
       4: invokevirtual #30                 // Method chapter_08/task_08$.scala$App$_setter_$executionStart_$eq:(J)V
       7: return

  public static long executionStart();
    Code:
       0: getstatic     #16                 // Field chapter_08/task_08$.MODULE$:Lchapter_08/task_08$;
       3: invokevirtual #34                 // Method chapter_08/task_08$.executionStart:()J
       6: lreturn
}

 */