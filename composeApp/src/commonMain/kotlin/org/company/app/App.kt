package org.company.app

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import browserchartsdeom.composeapp.generated.resources.*
import com.aay.compose.donutChart.PieChart
import com.aay.compose.donutChart.model.PieChartData
import org.company.app.theme.AppTheme
import org.company.app.theme.LocalThemeIsDark
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.resources.vectorResource

@Composable
internal fun App() = AppTheme {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        val testPieChartData: List<PieChartData> = listOf(
            PieChartData(
                partName = "Egypt",
                data = 400.0,
                color = Color(0xFF0027FF),
            ),
            PieChartData(
                partName = "Jordan",
                data = 300.0,
                color = Color(0xFF3F51B5),
            ),
            PieChartData(
                partName = "China",
                data = 300.0,
                color = Color(0xFF1F233A),
            ),
            PieChartData(
                partName = "Palestine",
                data = 600.0,
                color = Color(0xFFADC9FF),
            ),
        )
        PieChart(
            modifier = androidx.compose.ui.Modifier
                .width(464.dp)
                .height(517.dp),
            pieChartData = testPieChartData,
        )
////        Text(
////            text = stringResource(Res.string.cyclone),
////            fontFamily = FontFamily(Font(Res.font.IndieFlower_Regular)),
////            style = MaterialTheme.typography.displayLarge
////        )
//
//        var isAnimate by remember { mutableStateOf(false) }
//        val transition = rememberInfiniteTransition()
//        val rotate by transition.animateFloat(
//            initialValue = 0f,
//            targetValue = 360f,
//            animationSpec = infiniteRepeatable(
//                animation = tween(1000, easing = LinearEasing)
//            )
//        )
//
//        Image(
//            modifier = Modifier
//                .size(250.dp)
//                .padding(16.dp)
//                .run { if (isAnimate) rotate(rotate) else this },
//            imageVector = vectorResource(Res.drawable.ic_cyclone),
//            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
//            contentDescription = null
//        )
//
//        ElevatedButton(
//            modifier = Modifier
//                .padding(horizontal = 8.dp, vertical = 4.dp)
//                .widthIn(min = 200.dp),
//            onClick = { isAnimate = !isAnimate },
//            content = {
//                Icon(vectorResource(Res.drawable.ic_rotate_right), contentDescription = null)
//                Spacer(Modifier.size(ButtonDefaults.IconSpacing))
//                Text(
//                    stringResource(if (isAnimate) Res.string.stop else Res.string.run)
//                )
//            }
//        )
//
//        var isDark by LocalThemeIsDark.current
//        val icon = remember(isDark) {
//            if (isDark) Res.drawable.ic_light_mode
//            else Res.drawable.ic_dark_mode
//        }
//
//        ElevatedButton(
//            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp).widthIn(min = 200.dp),
//            onClick = { isDark = !isDark },
//            content = {
//                Icon(vectorResource(icon), contentDescription = null)
//                Spacer(Modifier.size(ButtonDefaults.IconSpacing))
//                Text(stringResource(Res.string.theme))
//            }
//        )
//
//        TextButton(
//            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp).widthIn(min = 200.dp),
//            onClick = { openUrl("https://github.com/terrakok") },
//        ) {
//            Text(stringResource(Res.string.open_github))
//        }
    }
}

internal expect fun openUrl(url: String?)