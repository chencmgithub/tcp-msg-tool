package com.csii.tmt.utils;

import javax.swing.JOptionPane;

public abstract class AssertUtils {
	public static boolean isEmpty(String content,String message) {
		if ("".endsWith(content) || content == null) {
			JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
			return true;
		}
		return false;
	}
}
