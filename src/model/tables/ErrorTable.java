package model.tables;

public class ErrorTable {

	public static final int MISPLACED_LABEL = 0;
	public static final int MISSING_MISPLACED_OPERATION_MNEMONIC = 1;
	public static final int MISSING_MISPLACED_OPERAND_FIELD = 2;
	public static final int DUPLICATE_LABEL_DEFINITION = 3;
	public static final int STATEMENT_CANT_HAVE_LABEL = 4;
	public static final int STATEMENT_CANT_HAVE_OPERAND = 5;
	public static final int WRONG_OPERATION_PREFIX = 6;
	public static final int UNRECOGNIZED_OPERATION_CODE = 7;
	public static final int UNDEFINED_SYMBOL_IN_OPERAND = 8;
	public static final int NOT_HEXADECIMAL_STRING = 9;
	public static final int CANT_BE_FORTMAT4_INSTRUCTION = 10;
	public static final int ILLEGAL_ADDRESS_FOR_REGISTER = 11;
	public static final int MISSING_END_STATEMENT = 12;
	public static final int LABEL_CANT_START_WITH_DIGIT = 13;
	public static final int WRONG_OPERAND_TYPE = 14;
	public static final int WRONG_ADDRESSING_MODE = 15;
	public static final int MISSING_FIRST_OPERAND = 16;
	public static final int MISSING_SECOND_OPERAND = 17;
	public static final int CANT_HAVE_FIRST_OPERAND = 18;
	public static final int CANT_HAVE_SECOND_OPERAND = 19;
	public static final int MORE_THAN_ONE_END = 20;
	public static final int MORE_THAN_ONE_START = 21;
	public static final int INCORRECT_OPERAND_FORMAT = 22;
	public static final int OPERAND_EXCEEDED_NUMBER_OF_DECIMAL_DIGITS = 23;
	public static final int STATEMENT_MUST_HAVE_LABEL = 24;
	public static final int DISPLACEMENT_OVERFLOW = 25;

	public static final int NO_ERROR = 90;

	public static String[] errorList = new String[100];

	public static void loadErrorList() {
		errorList[MISPLACED_LABEL] = "ERROR: Misplaced label";
		errorList[MISSING_MISPLACED_OPERATION_MNEMONIC] = "ERROR: Missing or misplaced operation mnemonic ";
		errorList[MISSING_MISPLACED_OPERAND_FIELD] = "ERROR: Missing or misplaced operand field "; // DONE
		errorList[DUPLICATE_LABEL_DEFINITION] = "ERROR: Duplicate label definition "; // DONE
		errorList[STATEMENT_CANT_HAVE_LABEL] = "ERROR: This statement cant have a label "; // DONE
		errorList[STATEMENT_CANT_HAVE_OPERAND] = "ERROR: This statement cant have an operand "; // DONE
		errorList[WRONG_OPERATION_PREFIX] = "ERROR: Wrong operation prefix "; // DONE
		errorList[UNRECOGNIZED_OPERATION_CODE] = "ERROR: Unrecognized operation code "; // DONE
		errorList[UNDEFINED_SYMBOL_IN_OPERAND] = "ERROR: Undefined symbol in operand ";
		errorList[NOT_HEXADECIMAL_STRING] = "ERROR: Not a hexadecimal string "; // DONE
		errorList[CANT_BE_FORTMAT4_INSTRUCTION] = "ERROR: Cant be format 4 instruction "; // DONE
		errorList[ILLEGAL_ADDRESS_FOR_REGISTER] = "ERROR: Illegal address for a register "; // DONE
		errorList[MISSING_END_STATEMENT] = "ERROR: Missing END statement ";
		errorList[LABEL_CANT_START_WITH_DIGIT] = "ERROR: Label can't start with a digit ";
		errorList[WRONG_OPERAND_TYPE] = "ERROR: Wrong operand type "; // DONE
		errorList[WRONG_ADDRESSING_MODE] = "ERROR: Wrong addressing Mode "; // DONE
		errorList[MISSING_FIRST_OPERAND] = "ERROR: Missing first operand "; // DONE
		errorList[MISSING_SECOND_OPERAND] = "ERROR: Missing second operand "; // DONE
		errorList[CANT_HAVE_FIRST_OPERAND] = "ERROR: Can't have first operand";
		errorList[CANT_HAVE_SECOND_OPERAND] = "ERROR: Can't have second operand";
		errorList[MORE_THAN_ONE_END] = "ERROR: More that one END encountered";
		errorList[MORE_THAN_ONE_START] = "ERROR: More that one START encountered";
		errorList[INCORRECT_OPERAND_FORMAT] = "ERROR: Incorrect Operand";
		errorList[OPERAND_EXCEEDED_NUMBER_OF_DECIMAL_DIGITS] = "ERROR: Operand exceeded number of decimal digits allowed";
		errorList[STATEMENT_MUST_HAVE_LABEL] = "ERROR: This statement requires a label";
		errorList[DISPLACEMENT_OVERFLOW] = "ERROR: Displacement overflow!";

		errorList[NO_ERROR] = "";
	}

}
