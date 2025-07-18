package rs117.hd.utils;

import java.util.Arrays;

public class Vector {
	public static float[] copy(float[] v) {
		return Arrays.copyOf(v, v.length);
	}

	public static float[] add(float[] out, float[] a, float[] b) {
		for (int i = 0; i < out.length; i++)
			out[i] = a[i] + b[i];
		return out;
	}

	public static float[] add(float[] a, float[] b) {
		return add(new float[a.length], a, b);
	}

	public static float[] add(float[] out, float[] a, float b) {
		for (int i = 0; i < out.length; i++)
			out[i] = a[i] + b;
		return out;
	}

	public static float[] add(float[] a, float b) {
		return add(new float[a.length], a, b);
	}

	public static float[] subtract(float[] out, float[] a, float[] b) {
		for (int i = 0; i < out.length; i++)
			out[i] = a[i] - b[i];
		return out;
	}

	public static float[] subtract(float[] a, float[] b) {
		return subtract(new float[a.length], a, b);
	}

	public static float[] subtract(float[] out, float[] a, float b) {
		for (int i = 0; i < out.length; i++)
			out[i] = a[i] - b;
		return out;
	}

	public static float[] subtract(float[] a, float b) {
		return subtract(new float[a.length], a, b);
	}

	public static float[] multiply(float[] out, float[] a, float[] b) {
		for (int i = 0; i < out.length; i++)
			out[i] = a[i] * b[i];
		return out;
	}

	public static float[] multiply(float[] a, float[] b) {
		return multiply(new float[a.length], a, b);
	}

	public static float[] multiply(float[] out, float[] a, float b) {
		for (int i = 0; i < out.length; i++)
			out[i] = a[i] * b;
		return out;
	}

	public static float[] multiply(float[] a, float b) {
		return multiply(new float[a.length], a, b);
	}

	public static float[] pow(float[] out, float[] in, float exp) {
		for (int i = 0; i < out.length; i++)
			out[i] = (float) Math.pow(in[i], exp);
		return out;
	}

	public static float[] pow(float[] in, float exp) {
		return pow(new float[in.length], in, exp);
	}

	public static float dot(float[] a, float[] b) {
		float f = 0;
		int len = Math.min(a.length, b.length);
		for (int i = 0; i < len; i++)
			f += a[i] * b[i];
		return f;
	}

	public static float[] cross(float[] out, float[] a, float[] b) {
		out[0] = a[1] * b[2] - a[2] * b[1];
		out[1] = a[2] * b[0] - a[0] * b[2];
		out[2] = a[0] * b[1] - a[1] * b[0];
		return out;
	}

	public static float length(float... vector) {
		float lengthSquared = 0;
		for (float v : vector)
			lengthSquared += v * v;
		return (float) Math.sqrt(lengthSquared);
	}

	public static void normalize(float[] vector) {
		float length = length(vector);
		if (length == 0)
			return;
		length = 1 / length;
		for (int i = 0; i < vector.length; i++)
			vector[i] *= length;
	}

	public static void abs(float[] out, float[] v) {
		for (int i = 0; i < out.length; i++)
			out[i] = Math.abs(v[i]);
	}
}
