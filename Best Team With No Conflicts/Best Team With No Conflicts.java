class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        List<int[]> player = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            player.add(new int[]{ages[i], scores[i]});
        }
        player.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = player.get(i)[1];
            for (int j = 0; j < i; j++) {
                if (player.get(j)[1] <= player.get(i)[1]) {
                    dp[i] = Math.max(dp[i], dp[j] + player.get(i)[1]);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
