package printer.type;

public enum Type {
	
	ITALIC {
		@Override
		public Print getType() {
			return new Italic();
		}
	},
	
	BOLD {
		@Override
		public Print getType() {
			return new Bold();
		}
	},
	
	UPPERCASE {
		@Override
		public Print getType() {
			return new Uppercase();
		}
	},
	
	LOWERCASE {
		@Override
		public Print getType() {
			return new Lowercase();
		}
	};
	
	public abstract Print getType();	
}