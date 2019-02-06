package javase02.t05;

public enum  Faculties {

    BUSINESS {
        public Subjects[] sub() {
            return new Subjects[] {Subjects.PSYCHOLOGY, Subjects.BUSINESS, Subjects.ENGLISH};
        }
    },
    ECONOMICS {
        public Subjects[] sub() {
            return new Subjects[] {Subjects.ECONOMICS, Subjects.ECONOMICS, Subjects.ENGLISH};
        }
    },
    GOVERMENT {
        public Subjects[] sub() {
            return new Subjects[] {Subjects.ECONOMICS, Subjects.BUSINESS, Subjects.DIVINITY};
        }
    },
    INTERNATIONAL_RELATIONS {
        public Subjects[] sub() {
            return new Subjects[] {Subjects.GEOGRAPHY, Subjects.HEALTH, Subjects.HISTORY};
        }
    },
    LANGUAGES {
        public Subjects[] sub() {
            return new Subjects[] {Subjects.ARTS, Subjects.LITERATURE, Subjects.ENGLISH};
        }
    },
    LAW {
        public Subjects[] sub() {
            return new Subjects[] {Subjects.RELIGION, Subjects.BUSINESS, Subjects.ENGLISH};
        }
    };
    public abstract Subjects[] sub();

}

