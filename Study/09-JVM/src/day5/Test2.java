package day5;

/**
 * @author : zhousy
 * @date : 2022/10/25 10:21
 * @version : 1.0
 */

/**
 * CAS(Compare and Swap) 它体现的是一种乐观锁的思想，需要配合volatile使用，实现无锁并发，适合竞争不激烈的多核cpu场景
 *      因为没有使用synchronized，所以不存在线程阻塞，这是效率提升的因素之一
 *      如果竞争激烈，可以想到重试必然经常发生，反而效率受到影响。
 *
 * 乐观锁与悲观锁
 *      java的乐观锁就是cas 悲观锁就是synchronized
 *
 * 原子操作类：
 *      juc(java.util.concurrent)中提供了原子操作类，可以提供线程安全的操作，例如atomicInteger
 *
 * synchronized的优化
 *      jdk6开始对synchronized底层做了一系列优化，使得性能大幅度提升，某些场景下性能比cas还要好。
 *      每个对象都有对象头(包括class指针和MarkWord)。MarkWord平时存储这个对象的哈希码、分代年龄，当加锁synchronized时候
 *          这些信息就会根据情况被替换为标记位、线程锁记录指针、重量锁指针、线程ID等信息。
 *
 * 轻量锁、
 *      每一个线程的栈帧中都会包含一个锁记录的结构内部可以来存储对象头的Mark Word(8个字节)，
 *          加锁的时候会复制Mark中的信息到栈帧的锁记录的结构中，解锁的时候再还原回去。
 *      例：线程1执行到同步代码块了(即加锁),从对象头的MarkWord中的2个字节判断锁的状态是未加锁01，将对象的Mark复制到线程1的栈帧的锁记录的结构中
 *         cas尝试将线程1的锁记录地址赋值给MarkWord，更新锁标记为00即轻量锁，MarkWord中也会多了线程1的锁记录地址
 *
 * 锁重入：如果发现对象有加锁且是当前线程加的锁，即自家的锁就会锁重入，进入锁并执行同步代码块的代码。
 *
 * 锁膨胀：如果尝试在加轻量级锁的过程中，cas操作无法成功，是因为有其他的线程为此对象加上了轻量级锁，这时候就会进行锁膨胀，轻量级锁会变成重量级锁。
 *
 * 重量锁：重量级锁竞争的时候，还可以使用自选来优化，如果当前线程自旋成功，这时候当前线程就可以避免阻塞
 *       在java6之后自旋锁可以自适应，比如对象刚刚自选成功过一次，那么就认为这次自旋成功率会很高，反之就不自旋，很智能
 *       自旋会占用CPU时间，单核CPU自旋就是浪费，多核才能发挥优势。
 *
 */
public class Test2 {
    public static void main(String[] args) {

    }
}
