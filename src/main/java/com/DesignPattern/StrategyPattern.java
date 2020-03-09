package com.DesignPattern;
public class StrategyPattern {
	public static void main(String args[]) throws InterruptedException { 
		int[] var = {1, 12, 32, 44, 55 };
		Context ctx = new Context(new BubbleSort()); 
		ctx.arrange(var);
		ctx = new Context(new QuickSort());
		ctx.arrange(var);
		}
	} interface Strategy {
		public void sort(int[] numbers);
		}
	class BubbleSort implements Strategy {
		public void sort(int[] numbers) {
			System.out.println("sorting array using bubble sort strategy");
			}
		}
	class InsertionSort implements Strategy {
		public void sort(int[] numbers) {
			System.out.println("sorting array using insertion sort strategy");
			}
		}
	class QuickSort implements Strategy {
		public void sort(int[] numbers) {
			System.out.println("sorting array using quick sort strategy");
			}
		}
	class MergeSort implements Strategy {
		public void sort(int[] numbers) {
			System.out.println("sorting array using merge sort strategy");
			}
		}
	class Context {
		private final Strategy strategy;
		public Context(Strategy strategy) {
			this.strategy = strategy; }
		public void arrange(int[] input) {
			strategy.sort(input);
			}
		}