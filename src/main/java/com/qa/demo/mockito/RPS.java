package com.qa.demo.mockito;

public enum RPS {

    ROCK {
        @Override
        public Result beats(RPS other) {
            if (this == other) return Result.DRAW;
            else if (other == SCISSORS) return Result.WIN;
            else return Result.LOSE;
        }
    }, PAPER {
        @Override
        public Result beats(RPS other) {
            if (this == other) return Result.DRAW;
            else if (other == ROCK) return Result.WIN;
            else return Result.LOSE;
        }
    }, SCISSORS {
        @Override
        public Result beats(RPS other) {
            if (this == other) return Result.DRAW;
            else if (other == PAPER) return Result.WIN;
            else return Result.LOSE;
        }
    };

    public abstract Result beats(RPS other);
}
