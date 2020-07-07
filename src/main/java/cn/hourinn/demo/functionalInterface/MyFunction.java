package cn.hourinn.demo.functionalInterface;


@FunctionalInterface
public interface MyFunction<T,R> {
	R apply(T t); 
}
