@API("/v1", interceptor = [CorsInterceptor::class])
class ReviewController : Resource() {

    private val reviewService : ReviewService =  ReviewServiceImpl()

    /**
     */
    @PUT(
      "/review",
      valid = [LoginStateValidator::class, BodyNullValidator::class]
    )
    fun submitAvatarReview() {
         val userId = context.user().principal().getString("userId")
        val reviewList = getBodyJson(SubmitReviewDataValidatorDTO::class.java) as SubmitReviewDataValidatorDTO
    }
}


/**		
                 * 跳过	
                 */		
//                if (resultSet.size > 4) {		
//                    resultSet = resultSet.subList(0, 4)		
//                }
